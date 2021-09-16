# fetch-merge-pull.md

#### Fetch

`git fetch`			&emsp;	Download all but no merge. Download all remote branches and won’t affect
							anything in your local repository, safe way to update your working directory\
`git fetch origin`	&emsp;	Download all but no merge.

`git diff origin/main`			&emsp;	See diferences after fetch\
`git diff main origin/main`	 	&emsp;	See diferences after fetch\
`git diff rama1 origin/rama1` 	&emsp;	See diferences between branches

If everything is OK we can rebase\
`git rebase origin` 	&emsp;	I am happy with changes and save it local\
`git pull` 				&emsp;	I am happy with changes and save it local

If we do `git rebase origin` or  `git pull` and  web server has changed we may need fix Fetch Conflic\


`git fetch upstream`	&emsp;		Fetch changes from upstream:\
Fetch changes from both origin and upstream in the same shot:\
`git fetch --multiple origin upstream`

#### Upstream
//todo
`git remote add upstream <repo-original>`\
`git remote -v`\
`git fetch upstream`\
`git pull upstream main`


#### Fetch Conflict
https://docs.github.com/es/github/collaborating-with-issues-and-pull-requests/resolving-a-merge-conflict-using-the-command-line

**Conflictos de fusión de cambios de líneas contrapuestos / Competing line change merge conflicts**\
`cd REPOSITORY-NAME`	&emsp;	Navigate into the local Git repository that has the merge conflict\
`git status`		   	&emsp;	Generate a list of the files affected by the merge conflict\
`<<<<<<<`, `=======`, `>>>>>>>`  	&emsp;	Edit in Notepad the file. Decide the changes\
`git add .`		&emsp;	Add or stage your changes\
`git commit -m "Resolved merge conflict by incorporating both suggestions"` emsp;Commit your changes with a comment

## Merge
Meging: Combining branched data and history together.\
`git merge <branch>` 	&emsp;		Merge <branch> into the current branch

Save all the commits from the branch in the form of a new commit\
`git checkout main`				&emsp;			Move to branch main\
`git merge feature-branch`		&emsp;			Merge feature-branch into main\
`git branch -d feature-branch`	&emsp;			Delete branch, will prevent you from deleting unmerged branches

Merge use two algoritm: 1 fast-forward 2 Three-way merging

`git merge origin/master`		&emsp;	Merge the origin/master to our local master branch.


`git merge --abort` //ABORT A MERGE


