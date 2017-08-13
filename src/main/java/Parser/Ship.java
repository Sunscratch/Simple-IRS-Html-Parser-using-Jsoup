package Parser;

public class Ship {
    private String vesselName;
    private String vesselType;
    private String companyName;
    private String shipOwner;
    private String flag;
    private String engineType;
    private String engineModel;
    private String enginePower;
    private String dwt;
    private String gross;
    private String length;
    private String buildYear;
    private String imoNum;
    private String callSign;

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setShipOwner(String shipOwner) {
        this.shipOwner = shipOwner;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public void setDwt(String dwt) {
        this.dwt = dwt;
    }

    public void setGross(String gross) {
        this.gross = gross;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public void setImoNum(String imoNum) {
        this.imoNum = imoNum;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    @Override
    public String toString() {
        String result = "Vessel Name: " + vesselName + "\n"
                + "Vessel Type: " + vesselType + "\n"
                + "Ship Manager: " + companyName + "\n"
                + "Ship owner: " + shipOwner + "\n"
                + "Flag: " + flag + "\n"
                + "Engine Type: " + engineType + "\n"
                + "Engine Model: " + engineModel + "\n"
                + "Engine BHP: " + enginePower + "\n"
                + "DWT: " + dwt + "\n"
                + "Gross " + gross + "\n"
                + "Length: " + length + "\n"
                + "Build Year: " + buildYear + "\n"
                + "IMO: " + imoNum + "\n"
                + "Call Sign: " + callSign + "\n";
        return result;
    }
}
