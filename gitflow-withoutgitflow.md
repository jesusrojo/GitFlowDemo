#### branchs.md

#### Init local project

```
git cd MyLocalProject
git init
//add files, commit files
git add --all
git commit -m "first commit"
git remote add origin git@github.com:jesusrojo/GitFlowDemo.git
git push -u origin main
git branch -M main   // OUR MAIN BRANCH  `main`
```

#### Create branch `dev` from `main`
```
git checkout -b dev
git push -u origin dev
```
#### Create branch `feature` from `dev`
```
git checkout dev
git checkout -b feature01
```
#### Work in branch `feature` and save changes in github (in branch `feature`)
```
git add --all
git commit -m "Add global-setup.md in feature01"	
git push origin feature01
```
#### Finish branch `feature `
```
git checkout dev
git merge feature01
```

#### Create branch `release` from `dev`
```
git checkout dev
git checkout -b release/0.1.1

git push -u origin release/0.1.1
```
#### Finish a `release` branch
```
git checkout main
git merge release/0.1.1
```

#### Push branch `main`
```
git checkout main
git push -u origin main
```
#### Tag new version
```
git tag -a v1.1 -m "Second version"  
git push origin v1.1
git push origin --tags   //PUSH ALL AT ONCE
```
////////////////////////////////////////////////////////////////////////////////

#### Create branch `feature02` from `dev`
```
git checkout dev
git checkout -b feature02
```
#### Work in branch `feature02` and save changes in github (in branch `feature02`)
```
git add --all
git commit -m "Update global-setup.md"	
git push origin feature02
```
#### Finish branch `feature02`
```
git checkout dev
git merge feature02
```
