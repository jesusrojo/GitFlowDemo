# fetch-merge-pull.md



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


