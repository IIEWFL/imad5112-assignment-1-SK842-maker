 # Daily Meal and Bevrage Recommender
 ## **Developer**: Samkelo Nkosnathi Khoza
 ## **Student Number**: ST10470317
 ## **Group**: 1
 ## **Course**: Higher Certificate in Mobile Aplication Development and web DevelopMent **Subject**: IMAD5112
 
----

# Links
### **GitHub Repository**: https://github.com/IIEWFL/imad5112-assignment-1-SK842-maker.git
### **YouTube Video**: https://youtu.be/v3WrIwitLXk
 
---

## Project Overview
 
The *Meal Suggestor is a mobile application developed as part of an assignment in the IMAD5112 subject.
This application was created using **Kotlin** and **Android Studio**. The app's primary purpose is to Display a suggested meal after a the user has input the time period in orderder for a meal to be suggested.
The app was developed to meet the requirements of the assignment, which includes creating a functional mobile app and utilizing GitHub for version control and CI/CD automation using GitHub Actions.

----
                                                                                                            
## App Purpose and Features

### Purpose:
The main goal of this app is to randomly Suggest A meal and  a beverage based on the time period of that day. 

# Key Features:

#### These features aim to provide the User to have randomly suggested/recommend a Meal or Beverage to have depending on the time period. This would benifit the user by not having to struggle to decide on what meal or beverage to have throughout the course of the day. 

#### The Apps UI Inputs allow for the user to Enter any timePeriod in order for a meal or beverage to be randomly generated.

### "UI Input of the Time Period for the Meal"
### "UI Input of the Time Period for the Beverage"

#### The 2 biggest features that play a vital role in intizilaizing the the running and functionality of the app are the two buttons for the recommendedMeal and recommendBeverage Buttons.Each of the buttons are initilized as private functions in order for the Processed information that was inputed in for the 1st two features to display an output answer for two of the texts "Outputs"suggested meal and suggested beverage.

### "RecommendationMealButton"
### "RecommendationBeverageButton"

#### The last Feature is the reset Button. The reset Button allows the user to Reset both the UI input and Processed aswers after Recommending a Meal or beverage.

### "ResetButton"

----
- This section breaks down the specific features and the purpose of the app, giving clarity on the app’s functionality.


## Design Considerations

The design of the **[Meal Suggestor app]** was based on the following key considerations:

1. **User Experience (UX)**: The app was designed with the goal of providing an Regular neat and concise UI that is Clear enough to Use for Everyday Use for the User.
   
2. **Responsiveness**: The app was built to ensure it Will Run on Any Device that the application would be able to function on. Eliminating the idea of being Inaccessible on specific devices that require certain specifications of the device to run the App
for example - in order dor the meal suggestor app to run the devices interface has be able to not have any run time errors when the app is being launched on the device.
   
3. **Simplicity**:  The Meal suggestor apps design was developed in a way for the user to not allow the user to struggle in having to
think for themselves on what to eat or drink for that time period. Instead the Application Uses Colours for Both Of the Meal and Beverage Inputs and Output. 
   
4. **Performance**:  The Meal Suggestor App Installation Process conssits of a very short Launching time. due to the optimization of
the two private functions. Each of the functions contain  conditional loops of if and else functions witch act as Code blocks that assist in the management of resources and computer logic.

---
## GitHub and GitHub Actions

This project was managed using **GitHub** for version control, where all code changes were committed and pushed regularly. GitHub enabled collaborative coding, allowing me to keep track of changes and maintain project integrity.

### GitHub Actions:
I utilized **GitHub Actions** to automate the build and deployment process. This includes:

- Running automated **tests** to ensure the app’s functionality.
- Compiling the app into **APK** and **AAB** files, which are the formats required for distribution.
- Uploading these build artifacts to GitHub for easy access.

The workflow ensures that my project is automatically built and tested every time I push changes, and it simplifies the process of delivering the final APK/AAB files for submission.
```markdown

```
---

### App Screenshots:

![Screenshot 1]![Screenshot_20250331_210511](https://github.com/user-attachments/assets/abb5b24e-4a1c-4a05-a133-7b33a1148beb)
*Caption for screenshot 1: this is the User interface of the Daily Meal and Beverage recommendor Application*

### Video Demo:
A video showcasing the app's functionality can be viewed here: https://youtu.be/v3WrIwitLXk.


## Challenges and Learnings

During the development of this project, I encountered several challenges, including:

 **Challenge 1**: [Trying to inizilize a Random function in the Meal list String With the Nested if function]
    **Solution**: [I Asked Chat GPT how  the Radom function i wanted to Connect with the List of strings should look like]
    
   
 **Challenge 2**: [Trying to get the Emulator Running causing the App to crash ."]
    **Solution**: [Changed the The virtual device being used for the emulator to a diffrent Virtual device ]


**Challenge 3**:  [Declration of findviewbyid errors everytime i declare a new variable in the Main Activity Kotlin file."] 
       **Solution**: [Rebuild the gradle files so that the Variables could declare themselves without having to make any changes in the activity main file ]



##  Future Enhancements
   While the current version of the app provides the core functionality, there are several features that could be added in the future, including:

 **Feature 1**: Reccommend Based on mood "This Feature  would work based on a users facial expression. therefore tha Application would Randomly Recommend a Meal based on facial eaxpression of the user."
 **Feature 2**: Allergy Detector "When a meal is randomly Recommended the app would be able to detect wether you are able to have this maeal or beverage when you input what meal or beverage you may be allergic to."


```markdown

```
## References
    
## Conditions and Loops. (2024, December 4). Retrieved from Kotlin: 
https://kotlinlang.org/docs/control-flow.html

## How to Change the Background color in android app. (2023, September 8). Retrieved from Medium: 
https://medium.com/@duaaawan/how-to-change-background-color-in-android-app-3d4dea54f35f#:~:text=If%20you%20wish%20to%20change,background%20color%20of%20your%20view.&text=Now%20Build%20and%20Run%20the,to%20the%20one%20you%20specified.

## Torres, D. (2024, March 19). Get a Random Item From a list in Kotlin. Retrieved from Baeldung:
https://www.baeldung.com/kotlin/list-get-random-item

## W3 Schools. (n.d.). Kotlin If... else. Retrieved from W3Schools:
https://www.w3schools.com/kotlin/kotlin_conditions.php

## How to Chenge Background Color in Activity main xml android studio
https://www.youtube.com/watch?v=TzjF8MSVV7w


```markdown

```
----


## Disclosure of AI Usage in My Assessment

In the development of this project, I have used generative AI tools to assist in various parts of the assignment. Below is a detailed disclosure of where and how these tools were used:

### 1. **Section(s) in which Generative AI was used:**
Used AI for brainstorming ideas for the app's features.

### **Name of AI Tool(s) Used:**
**ChatGPT** (OpenAI)

###  **Purpose/Intention Behind Use:**
- **Brainstorming**: Used ChatGPT to generate ideas for the app’s features and functionality.

 **Date(s) in Which Generative AI Was Used:**
 
-  **March 20, 2025**
-  **March 30, 2025**
- **15 March, 2025**




### 5. **Link to the AI Chat(s) or Screenshots:**

 **Chat 1 (Brainstorming App Features)**:
 [Link to the AI conversation/chat]((https://chatgpt.com/share/67ed7e80-6f3c-8008-88b9-5f9fb164d60d))  
 ![Screenshot 2025-04-02 202306](https://github.com/user-attachments/assets/7a953fbd-de1a-4776-85a8-a94a8dd33f69)
 ![Screenshot 2025-04-02 202517](https://github.com/user-attachments/assets/016bd09f-6208-47e2-9eb3-311f43a18e59)


 **Chat 2 ( Error Handling Code)**:
 ![Screenshot 2025-04-02 203433](https://github.com/user-attachments/assets/fabab4a2-b561-41e3-833f-4c24fa9e5cb0)
 ![Screenshot 2025-04-02 203520](https://github.com/user-attachments/assets/0b0f969c-d038-491f-83d5-c653ff019fb0)
 ![Screenshot 2025-04-02 203818](https://github.com/user-attachments/assets/47bddbd6-bd59-4761-a4ea-e68406e26cdc)
 [Link to the AI conversation/chat]((https://chatgpt.com/share/67ed8e06-6f8c-8008-b542-ed80846c390c))

 
**Chat 3 (Error Displaying Text in Textview After Button Click)**:
![Screenshot 2025-04-02 204146](https://github.com/user-attachments/assets/42de48d1-eb91-4fc4-81ae-09076ff2038e)
![Screenshot 2025-04-02 204229](https://github.com/user-attachments/assets/79d09474-1166-47b4-9add-715b1c6b34a9)
![Screenshot 2025-04-02 204738](https://github.com/user-attachments/assets/e309d9c6-32cb-4e15-b6d7-6707d49be31e)
![Screenshot 2025-04-02 204934](https://github.com/user-attachments/assets/d886ab99-64b9-420c-8e40-d6f91cde0ffd)


**Chat 4 ( I asked  Chat to see if My code would work without when statement and instead use a nested if Function)**:
![Screenshot 2025-04-02 205418](https://github.com/user-attachments/assets/622772ae-8e6c-4e57-9eb5-1d7a42ac720e)

 


----
- This section ensures that students are transparent about using AI tools in their project, promoting academic honesty and adhering to institution guidelines.

```markdown
```


