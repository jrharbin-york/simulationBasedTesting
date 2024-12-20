### Install the KUKA/TTS distribution (only if using the TTS use case)

If you have TTS DDDSimulator, you can upon the cell and build it properly, otherwise
the following pre-built distribution archive (as Dec 2022) of can be installed from:
```
https://drive.google.com/file/d/1I7VFG6G8AZYybZJscRfGQJ5Dgu_F90GU/view?usp=drive_link
```

Unpack this archive to a directory, e.g. 
```
mv ~/Downloads/KukaCell-2022_12_05_newtriggerzones.tar.gz ~/source/
tar -xvzf KukaCell-2022_12_05_newtriggerzones.tar.gz
```

The settings file within it, *runargs.ini*, needs to be set up:
```
cd ~/source/KukaCell-2022_12_05_newtriggerzones
```

Edit the file runargs.ini - in particular, if you have a license, set
it according to TTS installation instructions
