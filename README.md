# springboottest
springboottest.....
把一个已有的本地仓库与之关联，然后，把本地仓库的内容推送到GitHub仓库
  $ git remote add origin git@github.com:winkey4986/springboottest.git    建立关联
  $ git add .
  $ git commit -m "first commit"
  $ git push -u origin master

更新
$ git pull --rebase origin master
