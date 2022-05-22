# Sports-Micro-Service
IT4045c group project for spring boot/microservices

# Introduction
* Making a sports project that allows you to see who wins and who loses and the next upcoming game for that sport. For the sports, we would include MLB, NFL and Soccer into our project. We would make one database to contain the information regarding the wins and loses and the next upcoming game for that sport.


# Stand up:
**Note:** *Subject to change day/time*  
Tuesdays at 3pm  
https://tinyurl.com/3446bp3e

# Milestones:
1st - Stand up a basic UI and database  
2nd - Create class models with a stub and add entries to database.  
3rd - Connect the front end to the back end.


# StoryBoard:
https://trello.com/invite/b/seBh3Rni/3d1d0a0ef9b14d943c1b0b03afb38264/sports-service-board


# Functional Requirments:

### Scenario
As a user interested in sports, I want to be able to see the wins and losses and the next upcoming game for the sport I choose. If I would like to pick the stats pertaining the MLB, NFL, or MLS. 
### Dependencies 
A feed of user data is available 
### Assumptions
Stats are in English 
### Examples
### 1.1
### Given: 
      The three buttons for each sport are presented to you. The "MLB" button, the "NFL" button, and the "MLS" button
### When:
      I tap on the button of the sport I want to look at
### Then:
      I should be able to swipe and see all the wins/losses of the sport that has happened and the upcoming games 

### Scenario
As a user interested in sports, I want to be presented with the stats.
### Dependencies
The stat data is available and accessible 
### Assumptions
The stats are in English 
### Examples
### 1.1
### Given:
      A sport team is presented 
### When:
      I tap on the title of the team
### Then:
      The stats will show up with that specific team that I chose

### Scenario 
As a user interested in sports, I am done looking at the stats of the specific sport I chose. 
### Dependencies 
The stat data is available and accessible 
### Assumptions
Stats are in English
### Examples
### 1.1
### Given: 
      I have finished looking at the stats
### When: 
      I am interested in the stats of the sport team that I chose
### Then: 
      a overview of the stats is presented
### 1.2
### Given: 
      I have finished looking at the stats
### When: 
      I am not interested in any stats given 
### Then: 
      I should be presented with the option to pick another team or return to the main menu







# Class Diagram:


![image](https://user-images.githubusercontent.com/18122120/169656783-695c16d8-b312-4aec-97ba-352742aa8e91.png)











# Class Diagram Description:

getTeamName()
getSport()
getTotalWins()
getTotalLosses()
getNextGame()







# JSON Schema:
{  
    "Sport" : "MLB",  
    "TeamName" : "Cincinnati Reds",  
    "Wins" : "1",  
    "Losses" : "100",  
    "NextGame" : "5/31/2022"  
}










#   ScrumRole:
* Johannemann ScrumRole Leader/Dev
* Ian user interface Dev
* Raeshawn Database Dev 
* Eric Dev
