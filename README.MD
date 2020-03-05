## Randomize everything!

The service simply generates different random types and entities.

### Run the app

    gradlew bootRun

# REST API

## Generate random integer in a range

### Request

`POST /rnd/ints`

    {
        "minRange": 40
        "maxRange": 44
    }

### Response

    42
