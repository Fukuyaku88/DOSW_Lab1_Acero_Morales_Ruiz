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

![Challenge evidence](images/challengeN.png)

### Description

Briefly explain:

- What was implemented.
- How the work was divided.
- Which Git operations were used.
- Which conflicts appeared.
- How the conflicts were resolved.

## Challenge 3 — Mysterious Echo

### Evidence

![Challenge evidence](images/challengeN.png)

### Description

Briefly explain:

- Morales: As student A, I implement Function, Collectors, Stream, Function to create a functional interface for the function that I pass to solve the builder case, Collectors to convert the final stream into a String again with the joining with spaces, and Stream to pass the String to a Stream and operate over each element or in this case to repeat again all tha String 3 times, taking all the String as an element.
- Morales take the Student A role.
- Morales: checkout, add ., commit, push origin.
- Which conflicts appeared.
- How the conflicts were resolved.

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

Miguel Angel Acero Laverde
![Challenge evidence](images/A_10_challenge5.png)

Edgar Daniel Ruiz Patiño
![Challenge evidence](images/R_10_challenge5.jpeg)

### Description

Briefly explain:

- What was implemented. 
  - Morales: As Student B added the method for TreeSet army, so I only use TreeSet, 
    Stream and Collectors library, to transform the original TreeSet into a Stream, 
    then filter the data by numbers not divisible by 5, and finally join it again 
    with Collectors into another TreeSet, also added the random HashSet and TreeSet 
    that the exercise requires, so I use the library Random for that.
  - Miguel: I created the mergeCollections method which merge both different output 
    collections given by other methods (two). And fix the test to prove different cases.
- How the work was divided. 
  - Ruiz: Created general branch and worked as Student A (HashMap method)
  - Morales: As Student B added the method for TreeSet army, and added the random 
    HashSet and TreeSet that the exercise requires, so I use the library Random 
    for that.
  - Miguel: Fished the challenge implementing merge method to join both solutions
    and responsible to merge with develop branch.
- Which Git operations were used. 
  - Morales: I used checkout, pull origin, add ., commit, push and merge.
  - Miguel: I used checkout, pull origin, add ., commit, push, merge, branch and status.
- Which conflicts appeared.
  - Conflicts related with challenge 5 lines (but respect of add new information)
- How the conflicts were resolved.
  - Only just to choose the changes tha we have to save and deny them not. And all of this 
    to manual way.

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