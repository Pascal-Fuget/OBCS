# EventHandler CarDealer

This directory contains all necessary files to create a standalone Java application able to handle events pushed by a blockchain.
More specifically this one is dealing with recallEvent of the chaincode CarDealer you can find in the chaincode repository.

This sample is based on the Application Container sample provided here :
https://www.oracle.com/webfolder/technetwork/tutorials/obe/cloud/apaas/basic_grizzly_jersey/jersey-grizzly-json-service.html#section11

You can choose to use the create-maven-project.cmd in a directory where a maven project OBCSEventHandler will be created.
Then copy paste the java sources from /OBCS/EventHandler/carDealer/NB-OBCSEventHandler/src/main/java/com/example to your project directory.
Build the application with :
mvn clean compile
Run it with :
mvn exec:java

To create the standalone java archive use :
mvn package
This command will create an archive including all necessary libraries in it named OBCSEventHandler-1.0-SNAPSHOT.jar you can find it in the 
target directory of you project.

At this point you can use it on any platform with java -jar OBCSEventHandler-1.0-SNAPSHOT.jar
This can be done in a docker container for java and you can also use Oracle Application Container Cloud Service to deploy it.
The deployment to ACCS needs to create a zip file containing a manifest.json indicating the type of application and the main class to use.
The command createACCSzip.cmd in the NB-OBCSEventHandler directory is an example to do it with 7zip.
Go to your ACCS console, create a JavaSE application with 2 occurences 2 Gb RAM each and upload the zip file to run it.
That's it, now get the URL of your application in the ACCS console.
Get the certificate of the endpoint URL provided by ACCS.
Replace CRLF by /n in the cacert.
Go in EventHandler/carDealer and modify the subscribe.sh to put your cacert and your ACCS URL in the callbackURL.

You need the cardealer blockchain deployed in OBCS.
subscribe for one day to the recallEvent with subscribe.sh
Then generate an event by recalling an airbag using "generate recallevent.sh"
At this point the blockchain will push an event to your ACCS EventHandler that will keep it in memory.
To get the list of the events received by the OBCSEventHandler you can use "list events handled.sh".

We support only cacert for https callbackURL. If you decide to deploy the application out of ACCS, you will have to deploy it over http in which
case remove cacert in the subscribe.sh. Or over https and provide a certificate based on a cacert you will provide in subscribe.sh.

For NetBeans users you can clone the NB-OBCSEventHandler and open the project directly from NetBeans. No need to create the maven project. You can use
the same steps than above starting at Build the application.