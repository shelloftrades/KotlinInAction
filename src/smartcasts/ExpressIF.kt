package smartcasts

interface ExpressIF {

    class Num( val value: Int ) : ExpressIF
    class Sum(val left: ExpressIF, val right: ExpressIF) : ExpressIF
}