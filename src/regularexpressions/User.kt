package regularexpressions

class User (val id : Int, val name :String, val address :String)

fun User.validateBeforeSave () {
    // validate data
    fun validate (value :String, fieldName :String) {
        if (value.isEmpty()) {
            // you can access properties of User directly
            throw IllegalArgumentException ("Can't save user $id : empty $fieldName")
        }
    }
    validate (name, "Name")
    validate (address, "Address")
}

fun saveUser_newest (user :User) {
    user.validateBeforeSave() // calls the ext function, no need to pass param.
    // save user to database
}

fun saveUser_ver2 (user :User) {
    // you dont duplicate the user parameter of the saveUser function.
    fun validate (value :String, fieldName :String) {
        if (value.isEmpty()) {
            // You can access parameters of the outer function directly.
            throw IllegalArgumentException ("Can't save user ${user.id} : empty $fieldName")
        }
    }

    // Calls the local function to validate the specific fields
    validate (user.name, "Name")
    validate (user.address, "Address")

    // save user to database
}


fun saveUser_ver1 (user :User) {

    // These 2 if's / field validation is duplicate
    if (user.name.isEmpty()) {
        throw IllegalArgumentException (
                "Can't save user ${user.id} : empty Name"
        )
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException (
                "Can't save user ${user.id} : empty Address"
        )
    }

    // save user to database
}