import pyrebase
import firebase_admin
from firebase_admin import credentials

def motiondetect(a):


    config = {
    "apiKey": "AAAATN-ZpOw:APA91bFdXet6yxNzAnifpZ4resbb66YERmgP-vAADNA_Knn2bHLVO-aDeQQuL9q2ibMD9PYP-Hyk3-TaKPiZKZiFlC-SiJWY_bBliNq-AoyoiPM9KVvmuk-uve4-zKwAntbJTEVnblOQ",
    "authDomain": "motion-sensor-39267.firebaseapp.com",
    "databaseURL": "https://motion-sensor-39267.firebaseio.com",
    "storageBucket": "motion-sensor-39267.appspot.com"
    }

    firebase = pyrebase.initialize_app(config)

    db = firebase.database()

    data = {"text": a,"name": a}
    db.child("users").push(data)


motiondetect("Security Check!")
