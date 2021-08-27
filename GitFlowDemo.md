#### GitFlowDemo

## AFTER INIT PROJECT IN GITHUB
…or create a new repository on the command line
```
echo "# GitFlowDemo" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:jesusrojo/GitFlowDemo.git
git push -u origin main
```
…or push an existing repository from the command line
```
git remote add origin git@github.com:jesusrojo/GitFlowDemo.git
git branch -M main
git push -u origin main
```
## Second commit
```
git add --all
git commit -m "Add GitDemoFlow.md file"
git push -u origin main
```

