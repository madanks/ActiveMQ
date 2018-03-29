# ActiveMQ

Step 1: Downolad ActiveMQ from the following link and unzip it.

	http://activemq.apache.org/download.html(Now I have downloaded the apache-activemq-5.13.0)


Step 2: Install server 

	Open command prompt in as a Admin
	Go to the directory where ActiveMQ is saved 
	If 32 bit Java is installed go to [apache-activemq-5.13.0\bin\win32]
	If 64 bit Java is installed go to [apache-activemq-5.13.0\bin\win64]
	And execute the command [D:\ActiveMQ\apache-activemq-5.13.0-bin\apache-activemq-5.13.0\bin\win64>InstallService.bat]
	
Step 3: Start ActiveMQ server
	
	Go to windows services and select ActiveMQ service and start
	Once it is started Successfully
	Open the url in the browser [http://localhost:8161/admin/]
	Default UserName: admin
	Default Password: admin
	
Step 4: Clone the project url and run as maven build
	
	Put the command [spring-boot:run] as a goals and run the project
	
Step 5: Make a call to the end point whis push message to the queue 
	
	http://localhost:8080/rest/produce/Hi
	
Step 6: Check Queues, Topics, Subscriber, connection  in ActiveMQ console
	
