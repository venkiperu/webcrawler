# webcrawler

Dowload the git project to a location using git clone url:

https://github.com/venkiperu/webcrawler.git

Prerequsistes:

JDK 1.8 installed

Maven Installed and configured

Install the application using the following command:

mvn clean install

Run the application using the following command

mvn springboot:run

OR

Run the jar file in the following location

/target/crawler-api-0.0.1-SNAPSHOT.jar


To start the crawling of the site open a browser and type the following url

http://localhost:10001/api/crawl

The console will log the crawl messages apart from twitter.com urls

Things yet to be completed.


1.Unit Test

2. Integration test

3. Generating the sitemap xml or json

4. Read from the robot.txt to look for the urls not tp crawl.

5. URL & Depth values to be read from property files.

