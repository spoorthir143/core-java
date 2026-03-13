class CarrierService {
    static void pickUpPackage() {
        System.out.println("Carrier picked up package");
        HubRouter.sortToZipCode();
    }
}