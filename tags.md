#### tags.md

#### TAG
```
git tag -a v1.0 -m "First version"   // CREATE ANOTATED TAG
git tag 			 //LIST ALL TAGS
```
By default, git push will not push tags. 
Tags have to be explicitly passed to git push. Two options
```
//PUSH TAG INDIVIDUAL
git push origin <tagname>
git push origin v1.0
git push origin --tags   //PUSH ALL AT ONCE

git merge feature02
```