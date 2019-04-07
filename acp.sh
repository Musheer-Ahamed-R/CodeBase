find . -type f -name "*.class" -exec rm -f {} \;
git pull
git add .
git commit -m Sample
git push 
