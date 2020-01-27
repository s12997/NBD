printjson(db.people.insertOne(
{
    "sex" : "Male",
    "first_name" : "Hubert",
    "last_name" : "Miecznikowski",
    "job" : "none",
    "email" : "s12997@pja.edu.pl",
    "location" : {
        "city" : "Marki",
        "address" : {
            "streetname" : "Tajna",
            "streetnumber" : "11"
        }
    },
    "description" : "none",
    "height" : "183",
    "weight" : "90",
    "birth_date" : "1995-11-03T00:00:00Z",
    "nationality" : "Poland",
    "credit" : [ 
        {
            "type" : "IDK",
            "number" : "1337",
            "currency" : "PLN",
            "balance" : "100000000.00"
        }
    ]
}
))