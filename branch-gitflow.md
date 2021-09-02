## branch-gitflow.md


#### Create branch feature from dev
```
git checkout dev
git checkout -b my-feature01
```
#### Work in branch feature and save changes in github (in branch feature)
```
git add --all
git commit -m "Add global-setup.md in my-feature01"	
git push origin my-feature01
```
#### Look for new changes in dev


#### Merge new changes into my-feature01


#### Finish branch feature 
Download dev  and try to merge to see any conflicts
```
git checkout dev
git merge my-feature01
```
