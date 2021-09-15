# branch-gitflow.md
```
git branch -a   // LIST ALL BRANCH (local and remote)
```

## Clone one branch (dev) from Github
```
git clone -b <branchname> --single-branch <remote-repo-url>
git clone -b dev --single-branch git@github.com:jesusrojo/GitFlowDemo.git
```
## Create branch feature from dev
```
git checkout dev
git checkout -b jr-feature
```
## Work in branch feature & Save changes in github (in branch feature)
```
git add --all
git commit -m "Working in jr-feature"	
git push origin jr-feature
```



## Update local branch `dev` from Github

1. Update local branch `dev` from Github, see differences and `fetch` & `merge`
	```
	git checkout dev
	git fetch	//important to see the differences

	git diff origin/dev dev

	// q in Bash 

	git merge origin/dev
	git diff origin/dev dev   // make sure both are same
	```

2. Update local branch `dev` from Github and `pull`
	```
	git checkout dev
	git  pull
	```



## Merge local branch `dev` with our local `feature-branch`
```
git checkout feature-branch
git diff dev feature-branch
git merge dev
git diff dev feature-branch  // make sure both are same

```


## [UP] Work in `feature-branch` & Save changes in Github (in `feature-branch`)


## Finish `feature-branch` and Create a Pull Request in Github
Download  a new `dev` or see if there is any changes (as before).
Then try to merge to see any conflicts.
If everything is OK make a Pull Request from  `feature-branch` to `dev` in Github. 
Everything should be ok.
```
git checkout dev
git merge `feature-branch`
```