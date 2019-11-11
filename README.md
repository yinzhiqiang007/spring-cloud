# 
初始化

ps aux|grep apollo|grep -v 'grep' |awk '{print $2}'|xargs kill -9
ps aux|grep apollo|grep -v 'grep' |awk '{print $2}'
ps aux|grep java|grep -v 'grep' |awk '{print $2}'|xargs kill -9