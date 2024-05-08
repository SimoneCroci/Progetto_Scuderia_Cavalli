Scuderia
-
numeroFantino: String
nomeFantino: String
nomeCavallo: String
sede: String
annoFondazione: int
N_MAX_SCUDERIE: int = 6
-
+Scuderia(numeroFantino: String, nomeFantino: String, nomeCavallo: String, sede: String, annoFondazione: int)
+Scuderia(s1: Scuderia)
+getNumeroFantino(): String
+getNomeFantino(): String
+getNomeCavallo(): String
+getSede(): String
+getAnnoFondazione(): int
+setNumeroFantino(numeroFantino: String)
+setNomeFantino(nomeFantino: String)
+setNomeCavallo(nomeCavallo: String)
+setSede(sede: String)
+setAnnoFondazione(annoFondazione: int)
+aggiungiScuderia(numeroFantino: String, nomeFantino: String, nomeCavallo: String, sede: String, annoFondazione: int)
+rimuoviScuderia(numeroFantino: String)
+modificaScuderia(numeroFantino: String, nuovoNomeFantino: String, nuovoNomeCavallo: String, nuovaSede: String, nuovoAnnoFondazione: int)
+salvaCSV(nomeFile: String)
+salvaBinario(nomeFile: String)
+ordinaScuderiePerNomeFantino()
+ (aggiungiFantino(nomeFantino: String, nomeCavallo: String, sede: String, annoFondazione: int)
- (rimuoviFantino(nomeFantino: String))


Fantino
-
-nomeFantino: String
-eta: int
-nazionalita: String
-altezza: String
-N_MAX_FANTINI: int = 30
-
+Fantino(nomeFantino: String, eta: int, nazionalita: String, altezza: String)
+Fantino(f1: Fantino)
+getNomeFantino(): String
+getEta(): int
+getNazionalita(): String
+getAltezza(): String
+setNomeFantino(nomeFantino: String)
+setEta(eta: int)
+setNazionalita(nazionalita: String)
+setAltezza(altezza: String)
+aggiungiFantino(nomeFantino: String, eta: int, nazionalita: String, altezza: String)
+rimuoviFantino(nomeFantino: String)
+modificaFantino(nomeFantino: String, nuovoNomeFantino: String, nuovaEta: int, nuovaNazionalita: String, nuovaAltezza: String)
+salvaCSV(nomeFile: String)
+salvaBinario(nomeFile: String)
+ordinaFantiniPerNome()


Cavallo
-
-nomeCavallo: String
-etaCavallo: int
-razzaCavallo: String
-altezzaCavallo: String
-N_MAX_CAVALLI: int = 30
-
+Cavallo(nomeCavallo: String, etaCavallo: int, razzaCavallo: String, altezzaCavallo: String)
+Cavallo(c1: Cavallo)
+getNomeCavallo(): String
+getEtaCavallo(): int
+getRazzaCavallo(): String
+getAltezzaCavallo(): String
+setNomeCavallo(nomeCavallo: String)
+setEtaCavallo(etaCavallo: int)
+setRazzaCavallo(razzaCavallo: String)
+setAltezzaCavallo(altezzaCavallo: String)
+aggiungiCavallo(nomeCavallo: String, etaCavallo: int, razzaCavallo: String, altezzaCavallo: String)
+rimuoviCavallo(nomeCavallo: String)
+modificaCavallo(nomeCavallo: String, nuovoNomeCavallo: String, nuovaEtaCavallo: int, nuovaRazzaCavallo: String, nuovaAltezzaCavallo: String)
+salvaCSV(nomeFile: String)
+salvaBinario(nomeFile: String)
+ordinaCavalliPerNome()
