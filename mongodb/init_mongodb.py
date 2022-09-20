from pymongo import MongoClient


def upload_data():
    connection_string = "mongodb://mainUser:example@localhost:27017/airportlist?authSource=admin&retryWrites=true&w=majority"

    print("Start")
    client = MongoClient(connection_string)
    db_name = client['airportlist']
    collection_name = db_name['airports']
    read_and_parse(collection_name)
    print("End")


def read_and_parse(collection):
    with open('airports.dat', 'r') as read_obj:
        while True:
            line = read_obj.readline()
            if not line:
                break
            airport = {"_id": int(line[:line.find(',')]), "data": line}
            collection.insert_one(airport)


upload_data()
