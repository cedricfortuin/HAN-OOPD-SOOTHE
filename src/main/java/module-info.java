module Soothe {
    requires hanyaeger;
    requires java.desktop;
    
    exports han.soothe;
    opens sprites.cat;
    opens sprites.dog;
    opens sprites.rat;
    opens wallpapers;
    opens structures;
}