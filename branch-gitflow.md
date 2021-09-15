# branch-gitflow.md
```
git checkout -b feature-branch  //CREATE AND MOVE TO BRANCH
git branch -a   // LIST ALL BRANCH (local and remote)
```

## Clone `dev` branch from Github
```
git clone -b <branchname> --single-branch <remote-repo-url>
git clone -b dev --single-branch git@github.com:jesusrojo/GitFlowDemo.git
```
## Create `feature-branch` from `dev`
```
git checkout dev
git checkout -b feature-branch
```
## Work in `feature-branch` & Save changes to Github (in `feature-branch`)
```
git add --all
git commit -m "Working in feature-branch"	
git push origin jr-feature
//git push   // may give you the next error
```
#### Error git `Push` our local `feature-branch`to Github
 ```
git push
>
>fatal: The current branch jr-menu-readme has no upstream branch.\
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin feature-branch
	
// so we do

git push origin feature-branch

//or 

git push --set-upstream origin feature-branch
git push

// and later we will only need `git push`
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
After you finish all your commits and all your job, we need to incorparate all this to `dev` branch.\
Download a new branch `dev` from Github or see if there is any changes (as before).
See the differences and then try to merge `dev` with `feature-branch` to see any conflicts.
This a local test.
```
git checkout dev
git diff dev feature-branch 
git merge `feature-branch`
```
If everything is OK make a [Pull Request](https://docs.github.com/en/github/collaborating-with-pull-requests) 
from  `feature-branch` to `dev` in Github. 
Everything should be OK.
If your changes are accepted, the owner of the repo can merge your `feature-branch` to Github branch `dev`.
It may delete after `feature-branch` from Github.
Anyway your job is done!