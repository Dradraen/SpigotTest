# SpigotTest

This test was designed around completing the following prompt:

Create a Spring Boot REST API with endpoints that can handle GET/PUT/PATCH/DELTE requests for a single resource type. You can use Java or Kotlin for this API and your choice of Gradle or Maven. The purpose of this application is to provide non-technical team members the ability to set “posts” on a WordPress blog to be “featured” within our android applications. The idea here is to bring visibility to posts that have not yet generated a high enough score to be shown organically.

The data structure from the database can be assumed to be an object with the following properties:

· Id – auto-incrementing numeric value representing a post

· Slug – string representing the full path of the post

· Url – fully qualified url for the post

· Image – featured image for the post to be used within cards on mobile devices

A second database table needs to be created to hold a list of selected posts broken out by vertical. The table should assume the following structure:

· Id – integer representing the selected post

· Package Name – a string representing a selected vertical (com.wxyz.example.app1, com.wxyz.example.app2)

· Position – integer representing the position to insert the post within a list of sorted posts

· Active – Boolean field to be able to disable an offer at any given time without removing entirely

· Created At – Date representing record creation

· Updated At – Date representing the last update for the record

This table should assume that id, package name, and position are a composite key and will not allow the insert of duplicate records. Validation should be handled on the application side with helpful API response error messages.

Bonus – Front-end

As a bonus, use any frontend framework of your choosing to consume this API and display a page showing the existing placements as well as the list of available posts to give a test placement. A user should be able to add a new placement from the available posts, change the positions and packages, set a placement as active or inactive, and remove a placement altogether.

-------------------------------------------
I had 48 hours to complete this, and the resultant code is what I was able to design within the timeframe. It is currently experiencing an issue surrounding an entity manager bean in relation to autowiring the repository to the service, and I was unable to solve that with my current experience paired with the timeframe. 
