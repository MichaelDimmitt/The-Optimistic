##    TheHopefulGPA  
* Asks what the school's required credit hours are for graduation.  
* then the program takes in the students current GPA and current credit hours.    
* then computes the highest possible gpa a student can achieve-    
* if they earn straight A-s from that point untill graduation.  
   
##    Additional parts Set up (in place)  
* Because user will be from same institution, program makes a file for the project, storing input.     


						if (new File("output.txt").isFile()) 
						{
							System.out.println();
						} 
						else 
						{
							//make .txt file, inside project, for user.   
							try {
								output.createNewFile();  
								PrintWriter printer = new PrintWriter(output);  
								printer.print(creditsForGraduation);  
								printer.close();  
								System.out.println("file made!");  
							} catch (Exception e) {  
								e.printStackTrace();  
								System.out.println("could not make file");  
							}
						}

* Set up with a check to see if the file is made.  
* If the file is made it should skip the first prompt and move on to the second and third -(this functionality currently in progress)  
    
##   Functionality to be Added  
* Automatically understanding Upper GPA Hopeful/ LowerGPA hopeful  
* check whether advisor student undergrad or student grad. -advisor leaves neutral --others make difference.
* Setting up for student... remembering where student was in amount of creeit hours completed and the institutional hours to * * graduation.    
* Grades could then be entered as per what the student achieved that semester to see how each one influences overall gpa.  
* Have info in some corner on how much one grade in one class will effect GPA.  
