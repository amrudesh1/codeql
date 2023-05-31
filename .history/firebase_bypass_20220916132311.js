Java.perform(function () {
    var FirebaseOnCreate = Java.use('com.cred.firebase.MainActivity');
    FirebaseOnCreate.onCreate.overload('android.os.Bundle').implementation = function (bundle) {
        var fireBaseInstance = Java.use('com.google.firebase.FirebaseApp').getInstance();
        var firebaseDatabase = Java.use('com.google.firebase.database.FirebaseDatabase').getInstance();
        console.log("Firebase Instance: " + fireBaseInstance);
        console.log("Firebase Database: " + firebaseDatabase.getReferece());
        this.onCreate(bundle);
    }
});