Application airports-api
Handling requests from airport-client

Please use venv:

    virtualenv -p python3.8 venv

Activate venv:

    source venv/bin/activate

To create app image use: 

    ./build.sh

To start the app in docker and MongoDB in docker with migration use:

    ./run_app.sh [--restart]

    --restart - param to restart app container

To remove docker containers use:

    ./clear_space.sh