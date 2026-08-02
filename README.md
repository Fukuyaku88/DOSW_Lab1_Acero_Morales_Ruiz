# Laboratory 1 — Git, GitHub, and Functional Programming
**Course:** DOSW (2026-2)  
**Team Members:** Daniel Santiago Morales Perdomo, Miguel Ángel Acero Laverde, Edgar Daniel Ruiz Patiño

## Challenge 1 — Welcome Message

### Evidence
RUIZ DANIEL evidence:
![Challenge evidence](images/R_2_Challenge1.png)

Morales Daniel evidence:
![Challenge evidence](images/M_4_Challenge%201.0.png)
![Challenge evidence](images/M_5_Challenge%201.1.png)

Create a welcome message using Java functional programming.

Briefly explain:

- What was implemented. $\newline$ Ruiz: I created the test class, named it, and committed it.
Morales: I added the class Student with it´s attributes and getters.

- How the work was divided. $\newline$ There are 3 classes, one for each of one of the team members, Ruiz with the Challenge1 class, Morales with the Student class, and Acero with the class WelcomeMessage class.

- Which Git operations were used. $\newline$ Ruiz: I used the add . and commit command, also i used the push command, Morales: I used checkout, add ., commit, push, pull origin and merge.

- Which conflicts appeared.

- How the conflicts were resolved.


## Challenge 2 — Parallel Commit Raise

### Evidence

![Challenge evidence](images/challengeN.png)

### Description

Briefly explain:

- What was implemented.
  - Morales create the challenge mian challenge branch, changed the name to the file, and added tha base class and elements to use, 
  - Morales use checkout, pull origin, checkout -b, push -u origin, add ., commit, push origin.
  - Miguel: I implemented the Lane Two when lamda-based function
        returns the smallest and total size.
- How the work was divided.
  - Daniel Ruiz was Lane One, Miguel Acero was Lane Two and Daniel Morales
    created the base and tests class.
- Which Git operations were used.
  - Miguel: ckeckout, add ., pull origin, push, merge (with general challenge two branch), fetch 
    (to upodate all cloude branches).
- Which conflicts appeared.
  - 
- How the conflicts were resolved.

## Challenge 3 — Mysterious Echo

### Evidence

![Challenge evidence](images/challengeN.png)

### Description

Briefly explain:

- What was implemented.
- How the work was divided.
- Which Git operations were used.
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


