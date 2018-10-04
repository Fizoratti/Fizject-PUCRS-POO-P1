all:
	clear

	# javac App.java 
	# jar -cvf App *.class
	# java App

	javac Main.java 
	jar -cvf Main *.class
	java Main

	#
	# MANUAL
	#	Go to the directory which this file is in and (in the terminal) run:
	#	$ make
	#