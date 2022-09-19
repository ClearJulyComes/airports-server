if [ [$1 != "restart"] ]
then
  docker network create airports
  ./init_db.sh
fi
docker run -p 3000:8080 --net airports --name airports-api airports-api:0.0.1-SNAPSHOT