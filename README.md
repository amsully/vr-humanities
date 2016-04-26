# vr-humanities
This is a concept application of a virtual reality application that could be used to combine video with OpenGL 3-D scanned images.

## Getting started

This repository includes a JOGL.zip which should be imported to eclipse. Import the VR_Humanities into eclipse as well and configure build-path to include JOGL.
	- right click VR_Humanities -> Configure Build Path -> Projects tab -> add -> JOGL -> OKx2

Road Map

- Import OBJ files. - OBJ file parser not able to handle normals provided (need more advanced)
	- Alternative -- link out to models on sketchfab.
		https://skfb.ly/Nzwp - Statue One

###Current files:

- Main.java - Simple proof of concept. Uses personal desktop video player and personal desktop web browser. Requirement only Java 7.
- MediaPlayer.java - Simple implementation of media player - not used
- Modeler.java - OBJ parser. Not able to handle 'extra data'
- ObjModel.java - OBJ parser ripped out of modeler - attempt to adjust parser

###Libraries

- Java OpenGL - JOGL - This is not included on Github, library is too large
- jmf jar - for dealing with .flv encodings for video (to use must convert .mp4 files.
- xuggler - dealing with video encodings. Not enough time to learn/implement interface
- vecmath jar - handles vertex calculations

###Files

- zip of obj files (statue one,two, three)
- scene.mp4 - example video of 3 objects, recorded at William and Mary, Williamsburgh VA


## Note

This is not a final implementation but a mix of different objects that attempt to wrap the outputs of google glass and the iPad structure sensor.

##TODO (Roadmap)

- Rewrite obj parser
- Implement xuggler interface
- Create desktop interface for user
- Create VR interface for user
