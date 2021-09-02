## branch-gitflow.md


#### Clone one branch (dev) from Github
```
git clone -b <branchname> --single-branch <remote-repo-url>
git clone -b dev --single-branch git@github.com:jesusrojo/GitFlowDemo.git
```
#### Create branch feature from dev
```
git checkout dev
git checkout -b jr-feature-index
```
#### Work in branch feature and save changes in github (in branch feature)
```
git add --all
git commit -m "Add global-setup.md in jr-feature-index"	
git push origin jr-feature-index
```
#### Look for new changes in dev


#### Merge new changes into jr-feature-index


#### Finish branch feature 
Download dev  and try to merge to see any conflicts
```
git checkout dev
git merge jr-feature-index
```
