Scuderia
-
-numeroFantino: String
-nomeFantino: String
-nomeCavallo: String
-sede: String
-annoFondazione: int
N_MAX_SCUDERIE:int=6
-
+Scuderia(numeroFantino: String, nomeFantino: String,
nomeCavallo: String, sede: String, annoFondazione: int)
+Scuderia (Scuderia s1)

+getnumeroFantino(): String
+getnomeFantino(): String
+getNomeCavallo(): String
+getSede(): String
+getAnnoFondazione(): String

+setNumeroFantino(numeroFantino: String)
+setNomeFantino(nomeFantino: String)
+setNomeCavallo(nomeCavallo: String)
+setSede(sede: String)
+setAnnoFondazione(annoFondazione: String)

+aggiungiScuderia(numeroFantino:String , nomeFantino: String , 
nomeCavallo: String , sede: String , annoFondazione: int )
+rimuoviScuderia(numeroFantino: String ) 
+modificaScuderia(numeroFantino: String , nuovoNomeFantino: String , nuovoNomeCavallo: String , 
nuovaSede: String ,nuovoAnnoFondazione: int )
+salvaCSV(nomeFile: String)
+salvaBinario(nomeFile: String )
+ordinaScuderiePerNomeFantino()

Fantino
-
-nomeFantino: String
-eta: int
-nazionalita String
-altezza: String 
N_MAX_FANTINI:int=30
-
+Fantino(nomeFantino: String, eta: int, nazionalita: String
altezza: String)
+Fantino(Fantino f1)

+getNomeFantino(): String
+getEta(): int
+getNazionalita(): String
+getAltezza(): String

+setNomeFantino(nomeFantino: String)
+setEta(eta: int)
+setNazionalita(nazionalita: String)
+setAltezza(altezza: String)

+aggiungiFantino(nomeFantino: String ,eta: int ,
nazionalita: String , altezza: String)
+rimuoviFantino(nomeFantino: String )
+modificaFantino(nomeFantino: String, nuovoNomeFantino: String, nuovaEta: int,
nuovaNazionalita: String, nuovaAltezza: String )
nazionalita: String , altezza: String)
+salvaCSV(nomeFile: String)
+salvaBinario(nomeFile: String )
+ordinaFantiniPerNome()



Cavalli
-
-nomeCavallo: String
-etaCavallo: int
-razzaCavallo: String
-altezzaCavallo: String
N_MAX_CAVALLI:int=30
-
+Cavallo(nomeCavallo: String, etaCavallo: int,
razzaCavallo: String, altezzaCavallo: String)
+Cavallo (Cavallo c1)

+getNomeCavallo(): String
+getEtaCavallo(): int
+getRazzaCavallo(): String
+getAltezzaCavallo(): String

+setNomeCavallo(nomeCavallo: String)
+setEtaCavallo(etaCavallo: int)
+setRazzaCavallo(razzaCavallo: String)
+setAltezzaCavallo(altezzaCavallo: String)

+aggiungiCavallo(nomeCavallo: String ,etaCavallo: int ,
razzaCavallo: String , altezzaCavallo: String )
+rimuoviCavallo(nomeCavallo: String )
+modificaCavallo(nomeCavallo: String , nuovoNomeCavallo: String , nuovaEtaCavallo: int ,
nuovaRazzaCavallo: String , nuovaAltezzaCavallo: String )
+salvaCSV(nomeFile: String)
+salvaBinario(nomeFile: String )
+ordinaCavalliPerNome()
