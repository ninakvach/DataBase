--
-- TOC entry 202 (class 1259 OID 65732)
-- Name: Fatura; Type: TABLE; Schema: public; Owner: admin
--
CREATE ROLE admin LOGIN CREATEDB CREATEROLE SUPERUSER PASSWORD '1';
CREATE TABLE Fatura (
    fat integer NOT NULL,
    sip integer NOT NULL,
    tarih date NOT NULL
);


ALTER TABLE Fatura OWNER TO admin;

--
-- TOC entry 199 (class 1259 OID 57538)
-- Name: Kitap_Siparisi; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE Kitap_Siparisi (
    sip integer NOT NULL,
    "ISBN" character varying(8) NOT NULL,
    miktar integer
);


ALTER TABLE Kitap_Siparisi OWNER TO admin;

--
-- TOC entry 198 (class 1259 OID 57535)
-- Name: Kitaplar; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE Kitaplar (
    "ISBN" character varying(8) NOT NULL,
    isim character varying(30) NOT NULL,
    birim_fiyat real NOT NULL
);


ALTER TABLE Kitaplar OWNER TO admin;

--
-- TOC entry 200 (class 1259 OID 57547)
-- Name: Kullanicilar; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE Kullanicilar (
    id integer NOT NULL,
    kullanici_adi character varying(30) NOT NULL,
    sifre character varying(30) NOT NULL,
    rol integer NOT NULL
);


ALTER TABLE Kullanicilar OWNER TO admin;

--
-- TOC entry 196 (class 1259 OID 57529)
-- Name: Musteri; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE Musteri (
    mid integer NOT NULL,
    isim character varying(30) NOT NULL,
    email character varying(50) NOT NULL
);


ALTER TABLE Musteri OWNER TO admin;

--
-- TOC entry 201 (class 1259 OID 65721)
-- Name: Odemeler; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE Odemeler (
    fat integer NOT NULL,
    tak integer NOT NULL,
    odeme_miktari real,
    kart_numarisi character varying(18) NOT NULL
);


ALTER TABLE Odemeler OWNER TO admin;

--
-- TOC entry 197 (class 1259 OID 57532)
-- Name: Siparis; Type: TABLE; Schema: public; Owner: admin
--

CREATE TABLE Siparis (
    siparis integer NOT NULL,
    musteri integer NOT NULL
);


ALTER TABLE Siparis OWNER TO admin;

--
-- TOC entry 2853 (class 0 OID 65732)
-- Dependencies: 202
-- Data for Name: Fatura; Type: TABLE DATA; Schema: public; Owner: admin
--
