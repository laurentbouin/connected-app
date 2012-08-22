connected-app
=============

A simple Play Framework Application template ready to be a Foursquare Connected App


Before starting
---------------------

   * Install [Play Framework 1.2](http://www.playframework.org/download) 
   * Install [Google App Engine SDK](https://developers.google.com/appengine/downloads#Google_App_Engine_SDK_for_Java)

###App Engine: 

   * Go to your [Google App Engine account](https://appengine.google.com/) and create a new application (good luck to finding an available name)

###Foursquare: 

  1. Go to [Foursquare](https://foursquare.com/oauth) and register a new consumer
  2. Be sure to allow your consumer to receive push notifications
  3. for the Push URL: `https://your_gae_application.appspot.com/psh`
    

Start developing your Foursquare Connected App
----------------------------------------------

  1. Clone the repo
  2. `Play dependencies`
  3. `Play run`
  4. [Test your application](http://localhost:9000/)
  5. Click "Connect the App" see the error page
  6. In `/conf/application.conf` change `4sqre.client.id`, `4sqre.client.secret` and `4sqre.redirectURL` with your consumer's values.
  7. `4sqre.version` = today in the YYYYMMDD format

###Deployment: 

  1. Deploy your application with `play gae:deploy`
  2. go to https://your_gae_application.appspot.com
  3. connect the app to your foursquare account
  4. Go to your [consumer's details](https://foursquare.com/oauth) and use the "Send a test push" feature 
  5. If the test if successful, take your phone, checkin, enjoy :)

You want to see the template in action ? 
----------------------------------------

No prob, go to http://sorryisavailable.appspot.com and connect your foursquare account and checkin

You want to unit test your push consumer ? 
------------------------------------------

Yes ? Me too, I'm working on it. :)


Author
-------

**Laurent Bouin**

+ http://twitter.com/laurentbouin
+ http://about.me/laurentbouin