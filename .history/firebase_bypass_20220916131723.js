Java.perform(function () {
    var FirebaseOnCreate = Java.use('com.cred.firebase.MainActivity');
    FirebaseOnCreate.onCreate.overload('android.os.Bundle').implementation = function (bundle) {
        var fireBaseInstance = Java.use('com.google.firebase.FirebaseApp').getInstance();
        console.log("Firebase Instance: " + fireBaseInstance);
        this.onCreate(bundle);
    }
});