package sr.unasat.bedrijfgids.service;

import sr.unasat.bedrijfgids.entity.*;

public class DummyDataService {
    public static void createDummyData(){

    //__Create Entiteit
        EntiteitService entiteitService = new EntiteitService();
        Entiteit zaak1 = new Entiteit();
        Entiteit zaak2 = new Entiteit();
        Entiteit zaak3 = new Entiteit();
        Entiteit zaak4 = new Entiteit();

        zaak1.setTypeZaak("Naamloze Vennootschap (N.V.)");
        zaak2.setTypeZaak("Eenmans Zaak");
        zaak3.setTypeZaak("Stichting of Vereniging");
        zaak4.setTypeZaak("Venootschao onder Firma(V.O.F.)");

        entiteitService.createEntiteit(zaak1);
        entiteitService.createEntiteit(zaak2);
        entiteitService.createEntiteit(zaak3);
        entiteitService.createEntiteit(zaak4);

    //__Create MediaFiles
        MediaFilesService mediaFilesService = new MediaFilesService();

        MediaFiles mediaFiles1 = new MediaFiles();
        MediaFiles mediaFiles2 = new MediaFiles();
        MediaFiles mediaFiles3 = new MediaFiles();
        MediaFiles mediaFiles4 = new MediaFiles();

        mediaFiles1.setFotos("foto 1");
        mediaFiles1.setVideos("video 1");

        mediaFiles2.setFotos("foto 2");
        mediaFiles2.setVideos("video 2");

        mediaFiles3.setFotos("foto 3");
        mediaFiles3.setVideos("video 3");

        mediaFiles4.setFotos("foto 4");
        mediaFiles4.setVideos("video 4");

        mediaFilesService.createMediaFiles(mediaFiles1);
        mediaFilesService.createMediaFiles(mediaFiles2);
        mediaFilesService.createMediaFiles(mediaFiles3);
        mediaFilesService.createMediaFiles(mediaFiles4);

    //__Create Industrie
        IndustrieService industrieService = new IndustrieService();

        Industrie industrie1 = new Industrie();
        Industrie industrie2 = new Industrie();

        industrie1.setIndustrieNaam("Internet Service Providers (ISP)");
        industrie2.setIndustrieNaam("Handel");

        industrieService.createIndustrie(industrie1);
        industrieService.createIndustrie(industrie2);

    //__Create Bedrijven
        BedrijfService bedrijfService = new BedrijfService();

        Bedrijf bedrijf1 = new Bedrijf();
        Bedrijf bedrijf2 = new Bedrijf();
        Bedrijf bedrijf3 = new Bedrijf();
        Bedrijf bedrijf4 = new Bedrijf();
        Bedrijf bedrijf5 = new Bedrijf();

        bedrijf1.setBedrijf_naam("HSDS");
        bedrijf1.setFiliaal("HSDS Noord");
        bedrijf1.setFiliaal_adress("Ringweg Noord 36");
        bedrijf1.setEmail_adress("costumer@hsds.sr");
        bedrijf1.setTelefoon_nummer("+597 545326");
        bedrijf1.setEntiteit(zaak1);
        bedrijf1.setMediaFiles(mediaFiles1);

        bedrijf2.setBedrijf_naam("HSDS");
        bedrijf2.setFiliaal("HSDS Wanica");
        bedrijf2.setFiliaal_adress("Indira Ghandiweg 773");
        bedrijf2.setEmail_adress("costumer@hsds.sr");
        bedrijf2.setTelefoon_nummer("+597 545286");
        bedrijf2.setEntiteit(zaak1);
        bedrijf2.setMediaFiles(mediaFiles1);

        bedrijf3.setBedrijf_naam("CHS");
        bedrijf3.setFiliaal("CHS Wanica");
        bedrijf3.setFiliaal_adress("chswanicastraat");
        bedrijf3.setEmail_adress("costumer@chs.sr");
        bedrijf3.setTelefoon_nummer("+597 123");
        bedrijf3.setEntiteit(zaak1);
        bedrijf3.setMediaFiles(mediaFiles2);

        bedrijf4.setBedrijf_naam("TELESUR");
        bedrijf4.setFiliaal("TELESUR Wanica");
        bedrijf4.setFiliaal_adress("telesurwanicastraat");
        bedrijf4.setEmail_adress("costumer@telesur.sr");
        bedrijf4.setTelefoon_nummer("+597 69596");
        bedrijf4.setEntiteit(zaak1);
        bedrijf4.setMediaFiles(mediaFiles3);

        bedrijf5.setBedrijf_naam("DIGICEL");
        bedrijf5.setFiliaal("DIGICEL Wanica");
        bedrijf5.setFiliaal_adress("digicelwanicastraat");
        bedrijf5.setEmail_adress("costumer@digicel.sr");
        bedrijf5.setTelefoon_nummer("+597 5454158748");
        bedrijf5.setEntiteit(zaak1);
        bedrijf5.setMediaFiles(mediaFiles4);

        bedrijfService.createBedrijf(bedrijf1);
        bedrijfService.createBedrijf(bedrijf2);
        bedrijfService.createBedrijf(bedrijf3);
        bedrijfService.createBedrijf(bedrijf4);
        bedrijfService.createBedrijf(bedrijf5);

    //__Create Join table Bedrijven_Industrie
        bedrijf1.getIndustries().add(industrie2);
        industrie2.getBedrijfs().add(bedrijf1);

        bedrijf2.getIndustries().add(industrie2);
        industrie2.getBedrijfs().add(bedrijf2);

        industrie1.getBedrijfs().add(bedrijf3);
        bedrijf3.getIndustries().add(industrie1);

        industrie1.getBedrijfs().add(bedrijf4);
        bedrijf4.getIndustries().add(industrie1);

    //__Create Filialen
        FilialenService filialenService = new FilialenService();

        Filialen filiaal1 = new Filialen();
        Filialen filiaal2 = new Filialen();
        Filialen filiaal3 = new Filialen();
        Filialen filiaal4 = new Filialen();
        Filialen filiaal5 = new Filialen();
        Filialen filiaal6 = new Filialen();

        filiaal1.setTelefoonNummer("597 545326 597 545286");
        filiaal1.setAdress("Ringweg");
        filiaal1.setDistrict("Paramaribo");
        filiaal1.setOpeningstijden("Ma-Sa 9:00-19:00, Su 11:00-17:00");
        filiaal1.setBedrijf(bedrijf1);

        filiaal2.setTelefoonNummer("+597 545326 - +597 545286");
        filiaal2.setAdress("Pad van Wanica");
        filiaal2.setDistrict("Paramaribo");
        filiaal2.setOpeningstijden("Ma-Sa 9:00-17:00, Su closed");
        filiaal2.setBedrijf(bedrijf1);

        filiaal3.setTelefoonNummer("+597 473944");
        filiaal3.setAdress("Havenlaan zuid 1");
        filiaal3.setDistrict("Paramaribo");
        filiaal3.setOpeningstijden("Ma-Vr 7:00-15:00");
        filiaal3.setBedrijf(bedrijf3);

        filiaal4.setTelefoonNummer("+597 494555");
        filiaal4.setAdress("Zonnebloemstraat");
        filiaal4.setDistrict("Paramaribo");
        filiaal4.setOpeningstijden("Ma-Do 7:00-18:00, Su Vr 9:00-14:00");
        filiaal4.setBedrijf(bedrijf3);

        filiaal5.setTelefoonNummer("+597 490066");
        filiaal5.setAdress("Marcel Straat");
        filiaal5.setDistrict("Paramaribo");
        filiaal5.setOpeningstijden("Ma-Vr 8:00-16:00");
        filiaal5.setBedrijf(bedrijf2);

        filiaal6.setTelefoonNummer("+597 462626");
        filiaal6.setAdress("Henck Arronstraat 27");
        filiaal6.setDistrict("Paramaribo");
        filiaal6.setOpeningstijden("Ma-Vr 8:00-16:30");
        filiaal6.setBedrijf(bedrijf1);

        filialenService.createFilialen(filiaal1);
        filialenService.createFilialen(filiaal2);
        filialenService.createFilialen(filiaal3);
        filialenService.createFilialen(filiaal4);
        filialenService.createFilialen(filiaal5);
        filialenService.createFilialen(filiaal6);

    }

}
