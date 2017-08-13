import Parser.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input file path: ");
        Scanner in  = new Scanner(System.in);
        String root = in.nextLine();
        Parser parser = new Parser(root);
        Ship ship = new Ship();
        ship.setVesselName(parser.parseShipName());
        ship.setVesselType(parser.parseShipType());
        ship.setCompanyName(parser.parseShipManager());
        ship.setShipOwner(parser.parseShipOwner());
        ship.setFlag(parser.parseShipFlag());
        ship.setEngineType(parser.parseEngineType());
        ship.setEngineModel(parser.parseEngineModel());
        ship.setEnginePower(parser.parseEnginePower());
        ship.setDwt(parser.parseShipDWT());
        ship.setGross(parser.parseShipGross());
        ship.setLength(parser.parseShipLength());
        ship.setBuildYear(parser.parseShipBuildYear());
        ship.setImoNum(parser.parseShipIMO());
        ship.setCallSign(parser.parseShipCallSign());


        System.out.print(ship);
    }
}
