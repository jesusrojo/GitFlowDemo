## branch-gitflow.md
```
git branch -a   // LIST ALL BRANCH (local and remote)
```

#### Clone one branch (dev) from Github
```
git clone -b <branchname> --single-branch <remote-repo-url>
git clone -b dev --single-branch git@github.com:jesusrojo/GitFlowDemo.git
```
#### Create branch feature from dev
```
git checkout dev
git checkout -b jr-feature
```
#### Work in branch feature & Save changes in github (in branch feature)
```
git add --all
git commit -m "Working in jr-feature"	
git push origin jr-feature
```
#### Look for new changes in dev
```
git checkout dev
git fetch	//important

git diff origin/dev dev

git diff branch1..branch2
git diff main..branch1 -- README  // DIFFERENCES IN FILE
git diff --stat --color remotes/origin/dev..origin/dev
git diff remotes/origin/dev..origin/dev
```

#### Merge new changes into jr-feature
```
git checkout jr-feature
git merge dev
```
###### [UP] Work in branch feature & Save changes in github (in branch feature)

#### Finish branch feature 
Download dev  and try to merge to see any conflicts
```
git checkout dev
git merge jr-feature
```
#### Createa PullRequest in Github