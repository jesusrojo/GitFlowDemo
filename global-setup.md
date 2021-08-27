#### global-setup.md

#### TAG
```
git tag -a v1.0 -m "First version"   // CREATE ANOTATED TAG
git tag 							 //LIST ALL TAGS
```
By default, git push will not push tags. 
Tags have to be explicitly passed to git push. Two options
```
//PUSH TAG INDIVIDUAL
git push origin <tagname>
git push origin v1.0
git push origin --tags   //PUSH ALL AT ONCE
```
#### Create branch dev
```
git checkout -b dev
git push -u origin dev
```
#### Create branch feature from dev
```
git checkout dev
git checkout -b feature_01
```
#### Work in branch feature and save changes in github (in branch feature)
```
git add --all
git commit -m "Add file and work in feature_01"	
git push origin feature1		// Push our branch to Github
```
#### Finish branch feature 
```
git checkout develop
git merge feature_01
```

