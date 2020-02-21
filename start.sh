echo "Restarting OpenWIS_Training";
pkill -9 -f cicd-example*

nohup java -jar cicd-example-1.0.0-SNAPSHOT.jar &>/dev/null &
echo "OpenWIS_Training started"

