docker pull mongo:4.0.4
docker run -d -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME="mainUser" -e MONGO_INITDB_DATABASE="airportlist" -e MONGO_INITDB_ROOT_PASSWORD="example" --net airports --name test-mongo mongo:latest
python mongodb/init_mongodb.py