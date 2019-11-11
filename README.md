# 
初始化

ps aux|grep apollo|grep -v 'grep' |awk '{print $2}'|xargs kill -9
ps aux|grep apollo|grep -v 'grep' |awk '{print $2}'
ps aux|grep java|grep -v 'grep' |awk '{print $2}'|xargs kill -9

java -jar api-1.0-SNAPSHOT.jar -Dapollo.configService=http://39.105.158.174:8080