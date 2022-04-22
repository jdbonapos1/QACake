# Eri's Cakeclopedia 
by JD Bonapos


# Introduction
The brief specified that the task was to design and create a crud application with a visual front-end that encapsulated all core modules. 
For my project I decided to create an inventory that stores information on cakes, where users can add their own cakes to the database while also making other necessary changes. The API comes with a fully CRUD functional front-end webpage in which users can interact and provide inputs.


# Scope
Project Management - Jira
Databases - SQL
Java SE/Springboot
Testing - Mock MVC
Front-End - API Integration


# Planning
I used Jira software to create my Kanban board, I selected the scrum model. Here I began with creating user stories and tasks, assigning them to appropriate epics. I also made sure to implement agile principles and moscow prioritisation while also providing story point estimates. AFter filling up the backlog, I started a sprint to help me track my tasks. The sprint board was used to manage tasks moving them from: - to do to in progress to - done.
![Example of the user stories board](https://user-images.githubusercontent.com/100294516/164675423-1385ba7d-e96d-48ba-a0b7-cad5ae5a70cb.png)

![Example of a user story](https://user-images.githubusercontent.com/100294516/164675878-13e127b9-c30d-4c3c-a9f4-e2fc360a7baa.png)

![Here are the epics used](https://user-images.githubusercontent.com/100294516/164676724-07965a14-4fa0-4f7e-a268-8727ff636eb4.png)


One of the first tasks set on my user stories were to design a template for my web page. I used draw.io and Invisionfreehand to sketch an initial template and then a prototype webpage. 

![Initial template ](https://user-images.githubusercontent.com/100294516/164676248-d27e2ccb-8244-457b-904e-8bce041a497a.png)

![Prototype of Eri's Cakelopedia](https://user-images.githubusercontent.com/100294516/164676300-cc790ef1-c215-4da1-8c9a-27c7f7ca844b.png)


# Continous Integration (GIT)
I created a Github repository and made commits using the feature branch model. Pulling each sub-branch to dev then fnally onto master.
![2](https://user-images.githubusercontent.com/100294516/164680622-847c3a81-9bdc-462b-8b6a-094b1d26967d.png)


![Network Graph](https://user-images.githubusercontent.com/100294516/164681053-f9703238-1790-4c2e-8997-f9331c93d3a5.png)
However, I ran into a problem at a late stage with integration so I created a dev2 replacement branch and made all following commits from there to save time and confusion.


# Databases SQL
Two seperate databases were used, a local H2 database and a mySQL database that stores persistent data from the application. I created these on the mySQL Command Line. 

![Screenshot 2022-04-21 141533](https://user-images.githubusercontent.com/100294516/164688704-14475bdb-1a76-489b-bf2a-f46df8fb6c08.png)

![select  star cake](https://user-images.githubusercontent.com/100294516/164689049-6dae9fd5-f993-4d80-8813-2ed5c49ec183.png)


# Back-end
The projects back-end was created using Java implemented with Spring Boot Framework. I carefully sectioned my code within classes and interfaces making sure to apply Kanban board requirements.
![CakeController](https://user-images.githubusercontent.com/100294516/164701468-8f3b4556-7ca4-4815-9f20-492dd94a91b6.png)


# Testing
Integration testing was done such as MockMVC testing to deploy a partial part of the application which simulates a user input.
I used MockMVC to create a mock controller class, which performed HTTP request that simulates a user using the programme. I used it to test the create method.

![cakecontrollertest2](https://user-images.githubusercontent.com/100294516/164718582-d07ddc34-f4c1-45b4-9367-fdeafa83ae9d.png)

I found this area particularly difficult and  given I had more time I would've completed it. I now know that an improvement would be to focus more time and work into testing for my next project.


# Front-End
The front-end webpage was constructed using HTML, CSS and JavaScript. I also used the Boostrap framework to create components such as forms, modals and even styling on CSS. HTML provided the fundamental structure, CSS added them and design and JS was used to allow the webpage to interact with inputs to improve overall user experience. (e.g. modals popping up when clicking show cake) It was also used to for API integration with axios.

![1](https://user-images.githubusercontent.com/100294516/164720344-0ba2034c-d214-4f08-a92f-c806287a7ed8.png)
![2](https://user-images.githubusercontent.com/100294516/164720358-98dec23c-d8ee-492a-8c92-6574ff9f4f2d.png)
![3](https://user-images.githubusercontent.com/100294516/164720365-07fa62db-ab9b-4476-ab2e-fedd7739d019.png)
