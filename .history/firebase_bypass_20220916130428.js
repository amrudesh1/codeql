Java.perform(function () {
    var FirebaseOnCreate = Java.use('com.cred.firebase.MainActivity');
    FirebaseOnCreate.onCreate.overload('android.os.Bundle').implementation = function (bundle) {
        console.log("Bypassing Firebase");
        this.onCreate(bundle);
    }
});