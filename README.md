# Laboratory 1 — Git, GitHub, and Functional Programming
**Course:** DOSW (2026-2)  
**Team Members:** Daniel Santiago Morales Perdomo, Miguel Ángel Acero Laverde, Edgar Daniel Ruiz Patiño

## Initial Config

Miguel Angel Acero Laverde

![Challenge evidence](images/A_0_miguel_%20initial_git_conf.png)

Daniel Santiago Morales Perdomo

![Challenge evidence](images/M_0_rep_creation.png)
![Challenge evidence](images/M_1_collaborators_added.png)
![Challenge evidence](images/M_3_morales_initial_git_config.png)

Edgar Daniel Ruiz Patiño

![Challenge evidence](images/R_0_Creacion_develop.png)
![Challenge evidence](images/R_1_develop_propio.png)

## Challenge 1 — Welcome Message

### Evidence
Ruiz Daniel evidence:

![Challenge evidence](images/R_2_Challenge1.png)

Morales Daniel evidence:

![Challenge evidence](images/M_4_Challenge%201.0.png)
![Challenge evidence](images/M_5_Challenge%201.1.png)

Miguel Acero evidence:
![Challenge evidence](images/A_1_challenge1.png)
![Challenge evidence](images/A_2_challenge1.png)
![Challenge evidence](images/A_3_challenge1.png)

### Description
We had to create a structure message showing basic information
of each member of the group. Things like: name, currently
semester and institutional email.
On the other hand, was necesary create our own
locally branch to work, for then upload in GitHub and
merge with develop.
Create a welcome message using Java functional programming.

Briefly explain:

- What was implemented. 
1. Ruiz: I created the test class, named it, and committed it.
2. Morales: I added the class Student with it´s attributes and getters.
3. Miguel: I created the WelcomeMessage class with it's readme evidence and resolve the conflicts
- How the work was divided. 
$\newline$ There are 3 classes, one for each of one of the team members, Ruiz with the Challenge1 class, Morales with the Student class, and Acero with the class WelcomeMessage class.
- Which Git operations were used. 
1. Ruiz: I used the add . and commit command, also i used the push command. 
2. Morales: I used checkout, add ., commit, push, pull origin and merge.
3. Miguel: I used the same commands of my partners.
- Which conflicts appeared.
1. Miguel: Appeared conflict like CONFLICT (content) because one class
was created into principal class changing content of the class into my branch-.
- How the conflicts were resolved.
1. Miguel: I needed to move manually the class into the principle class and 
cut it to copy outside of principle class. Finally code worked and upload to 
develop branch.

## Challenge 2 — Parallel Commit Raise

### Evidence
This challenge simulates parallel development, synchronization, and merge conflicts.
Ruiz Daniel evidence:
- Fetch use
![Challenge evidence](images/R_2_Uso_del_fetch.png)
- Third collision
![Challenge evidence](images/R_3_ThirdCollision_challenge_2.png)


### Description

Briefly explain:

- What was implemented.
- How the work was divided.
- Which Git operations were used.
- Which conflicts appeared.
- How the conflicts were resolved.

## Challenge 3 — Mysterious Echo

### Evidence
Ruiz Daniel evidence:
- StringBuffer update
![Challenge evidence](images/R_5_buffer_challenge_3.png)
- merge
![Challenge evidence](images/R_5_merge_challenge_3.png)
- Conflicts
![Challenge evidence](images/R_6_conflicts_challenge_3.png)

### Description

Briefly explain:

- What was implemented. $\newline$
Ruiz Daniel: I implemented the code to create the Stringbuffer, also I made Collisions and resolved the conflicts $\newline$
Morales: As student A, I implement Function, Collectors, Stream, Function to create a functional interface for the function that I pass to solve the builder case, Collectors to convert the final stream into a String again with the joining with spaces, and Stream to pass the String to a Stream and operate over each element or in this case to repeat again all tha String 3 times, taking all the String as an element.
- How the work was divided. $\newline$
Morales take the Student A role.$\newline$
Ruiz Daniel: I was student B and I made merge conflicts.
- Which Git operations were used.$\newline$
git checkout/git merge/git commit / git push/git pull/git fetch/git branch /git add .

- Which conflicts appeared.$\newline$
Both function have the same name
- How the conflicts were resolved. $\newline$
we have a conflict with a repeated function name, the solution was join the two functions into one

## Challenge 4 — The Treasure of Duplicate Keys

### Evidence

![Challenge evidence](images/challengeN.png)

### Description

Briefly explain:

- What was implemented.
- How the work was divided.
- Which Git operations were used.
- Which conflicts appeared.
- How the conflicts were resolved.

## Challenge 5 — Battle of Sets

### Evidence

![Challenge evidence](images/challengeN.png)

### Description

Briefly explain:

- What was implemented.
- How the work was divided.
- Which Git operations were used.
- Which conflicts appeared.
- How the conflicts were resolved.

# Challenge 6— The Decision Machine

### Evidence

![Challenge evidence](images/challengeN.png)

### Description

Briefly explain:

- What was implemented.
- How the work was divided.
- Which Git operations were used.
- Which conflicts appeared.
- How the conflicts were resolved.


# Part 3 - Conceptual Questionnaire

## 1. Team agreements

- **What times will you meet?**  
  From Monday to Friday at 8:00 PM. If necessary, we can also meet on Saturday evenings.

- **What will your communication channels be?**  
  We will use Microsoft Teams for meetings and WhatsApp for communication.

- **How often will you meet?**  
  At least three days a week, from Monday to Friday.

- **If a conflict were to arise, how could you resolve it?**  
  Since there are three members in our group, decisions will be made democratically.

## 2. What is the difference between git merge and git rebase?

GIT MERGE: combines two branches by creating a new merge commit and preserving the history of both branches.

GIT REBASE: moves the commits from one branch on top of another, creating a cleaner and more linear history.

## 3. What happens when two branches modify the same line of a file?

Git will detect a merge conflict. The developer must choose which changes to keep or combine before completing the merge.

## 4. How can you display the branch and merge history graphically in the terminal?

Using the following command:

```bash
git log --graph --oneline --all
```