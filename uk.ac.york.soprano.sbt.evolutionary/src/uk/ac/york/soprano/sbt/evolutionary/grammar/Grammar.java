package uk.ac.york.soprano.sbt.evolutionary.grammar;

/*
 * Copyright 2020 Eric Medvet <eric.medvet@gmail.com> (as eric)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// JRH: this requires JGEA version 1.7.2 from:
// https://github.com/jrharbin-york/jgea

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @author eric
 */
public class Grammar<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	public static final String RULE_ASSIGNMENT_STRING = "::=";
	public static final String RULE_OPTION_SEPARATOR_STRING = "|";

	private T startingSymbol;
	private final Map<T, List<List<T>>> rules;

	public Grammar() {
		rules = new LinkedHashMap<>();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<T, List<List<T>>> rule : rules.entrySet()) {
			sb.append(rule.getKey()).append(" ").append(rule.getKey().equals(startingSymbol) ? "*" : "")
					.append(RULE_ASSIGNMENT_STRING + " ");
			for (List<T> option : rule.getValue()) {
				for (T symbol : option) {
					sb.append(symbol).append(" ");
				}
				sb.append(RULE_OPTION_SEPARATOR_STRING + " ");
			}
			sb.delete(sb.length() - 2 - RULE_OPTION_SEPARATOR_STRING.length(), sb.length());
			sb.append("\n");
		}
		return sb.toString();
	}

	public T getStartingSymbol() {
		return startingSymbol;
	}

	public void setStartingSymbol(T startingSymbol) {
		this.startingSymbol = startingSymbol;
	}

	public Map<T, List<List<T>>> getRules() {
		return rules;
	}

	public static Grammar<String> fromFile(File file) throws FileNotFoundException, IOException {
		return fromFile(file, "UTF-8");
	}
	
	public static Grammar<String> fromFile(String fileName) throws FileNotFoundException, IOException {
		File f = new File(fileName);
		return fromFile(f, "UTF-8");
	}

	public static Grammar<String> fromFile(File file, String charset) throws FileNotFoundException, IOException {
		Grammar<String> grammar = new Grammar<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
		String line;
		while ((line = br.readLine()) != null) {
			if (line.length() > 0) {
				String[] components = line.split(Pattern.quote(RULE_ASSIGNMENT_STRING));
				String toReplaceSymbol = components[0].trim();
				String[] optionStrings = components[1].split(Pattern.quote(RULE_OPTION_SEPARATOR_STRING));
				if (grammar.getStartingSymbol() == null) {
					grammar.setStartingSymbol(toReplaceSymbol);
				}
				List<List<String>> options = new ArrayList<>();
				for (String optionString : optionStrings) {
					List<String> symbols = new ArrayList<>();
					for (String symbol : optionString.split("\\s+")) {
						if (!symbol.trim().isEmpty()) {
							symbols.add(symbol.trim());
						}
					}
					if (!symbols.isEmpty()) {
						options.add(symbols);
					}
				}
				grammar.getRules().put(toReplaceSymbol, options);
			}
		}
		br.close();
		return grammar;
	}

}