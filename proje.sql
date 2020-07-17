--
-- PostgreSQL database dump
--

-- Dumped from database version 11.5
-- Dumped by pg_dump version 11.5

-- Started on 2019-12-21 12:31:58

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 202 (class 1259 OID 65732)
-- Name: Fatura; Type: TABLE; Schema: public; Owner: admin
--

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

INSERT INTO Fatura (fat, sip, tarih) VALUES (101, 100001, '2019-03-22');
INSERT INTO Fatura (fat, sip, tarih) VALUES (102, 100002, '2020-04-02');
INSERT INTO Fatura (fat, sip, tarih) VALUES (103, 100003, '2020-05-06');
INSERT INTO Fatura (fat, sip, tarih) VALUES (104, 100004, '2020-06-07');
INSERT INTO Fatura (fat, sip, tarih) VALUES (105, 100005, '2020-07-08');
INSERT INTO Fatura (fat, sip, tarih) VALUES (106, 100006, '2020-08-09');
INSERT INTO Fatura (fat, sip, tarih) VALUES (107, 100007, '2020-09-09');
INSERT INTO Fatura (fat, sip, tarih) VALUES (100, 100000, '2020-09-09');


--
-- TOC entry 2850 (class 0 OID 57538)
-- Dependencies: 199
-- Data for Name: Kitap_Siparisi; Type: TABLE DATA; Schema: public; Owner: admin
--

INSERT INTO Kitap_Siparisi (sip, "ISBN", miktar) VALUES (100007, '12345678', 2);
INSERT INTO Kitap_Siparisi (sip, "ISBN", miktar) VALUES (100006, '12345678', 4);
INSERT INTO Kitap_Siparisi (sip, "ISBN", miktar) VALUES (100005, '87654321', 1);
INSERT INTO Kitap_Siparisi (sip, "ISBN", miktar) VALUES (100006, '55555555', 5);
INSERT INTO Kitap_Siparisi (sip, "ISBN", miktar) VALUES (100003, '55555555', 10);
INSERT INTO Kitap_Siparisi (sip, "ISBN", miktar) VALUES (100000, '99999999', 2);


--
-- TOC entry 2849 (class 0 OID 57535)
-- Dependencies: 198
-- Data for Name: Kitaplar; Type: TABLE DATA; Schema: public; Owner: admin
--

INSERT INTO Kitaplar ("ISBN", isim, birim_fiyat) VALUES ('12345678', 'kitap1', 10);
INSERT INTO Kitaplar ("ISBN", isim, birim_fiyat) VALUES ('87654321', 'kitap2', 15);
INSERT INTO Kitaplar ("ISBN", isim, birim_fiyat) VALUES ('55555555', 'kitap3', 20);
INSERT INTO Kitaplar ("ISBN", isim, birim_fiyat) VALUES ('88888888', 'kitap4', 25);
INSERT INTO Kitaplar ("ISBN", isim, birim_fiyat) VALUES ('99999999', 'kitap5', 30);
INSERT INTO Kitaplar ("ISBN", isim, birim_fiyat) VALUES ('22222222', 'kitap6', 35);


--
-- TOC entry 2851 (class 0 OID 57547)
-- Dependencies: 200
-- Data for Name: Kullanicilar; Type: TABLE DATA; Schema: public; Owner: admin
--

INSERT INTO Kullanicilar (id, kullanici_adi, sifre, rol) VALUES (1, 'yusuf', 'merhabalar', 0);
INSERT INTO Kullanicilar (id, kullanici_adi, sifre, rol) VALUES (2, 'ipek', 'merhabalar', 0);
INSERT INTO Kullanicilar (id, kullanici_adi, sifre, rol) VALUES (3, 'hayri', 'merhabalar', 0);


--
-- TOC entry 2847 (class 0 OID 57529)
-- Dependencies: 196
-- Data for Name: Musteri; Type: TABLE DATA; Schema: public; Owner: admin
--

INSERT INTO Musteri (mid, isim, email) VALUES (1, 'İpek', 'ipek_koc@gmail.com');
INSERT INTO Musteri (mid, isim, email) VALUES (2, 'Yusuf', 'yusufani8@gmail.com');
INSERT INTO Musteri (mid, isim, email) VALUES (3, 'Hayri', 'hayri_cakir@gmail.com');
INSERT INTO Musteri (mid, isim, email) VALUES (4, 'Ahmet', 'aydin2ahhmet@gmail.com');
INSERT INTO Musteri (mid, isim, email) VALUES (5, 'Aykut', 'akdeniz@gmail.com');
INSERT INTO Musteri (mid, isim, email) VALUES (6, 'Tarik', 'tarikcarli@gmail.com');
INSERT INTO Musteri (mid, isim, email) VALUES (7, 'bagci', 'COLDJOKE@hotmail.com');


--
-- TOC entry 2852 (class 0 OID 65721)
-- Dependencies: 201
-- Data for Name: Odemeler; Type: TABLE DATA; Schema: public; Owner: admin
--

INSERT INTO Odemeler (fat, tak, odeme_miktari, kart_numarisi) VALUES (100, 0, NULL, '123456789123456789');
INSERT INTO Odemeler (fat, tak, odeme_miktari, kart_numarisi) VALUES (101, 1, NULL, '123456789123456789');
INSERT INTO Odemeler (fat, tak, odeme_miktari, kart_numarisi) VALUES (102, 2, NULL, '123456789123456789');
INSERT INTO Odemeler (fat, tak, odeme_miktari, kart_numarisi) VALUES (103, 3, NULL, '123456789123456789');
INSERT INTO Odemeler (fat, tak, odeme_miktari, kart_numarisi) VALUES (104, 0, NULL, '123456789123456789');
INSERT INTO Odemeler (fat, tak, odeme_miktari, kart_numarisi) VALUES (105, 1, NULL, '123456789123456789');
INSERT INTO Odemeler (fat, tak, odeme_miktari, kart_numarisi) VALUES (106, 2, NULL, '123456789123456789');
INSERT INTO Odemeler (fat, tak, odeme_miktari, kart_numarisi) VALUES (107, 3, NULL, '123456789123456789');


--
-- TOC entry 2848 (class 0 OID 57532)
-- Dependencies: 197
-- Data for Name: Siparis; Type: TABLE DATA; Schema: public; Owner: admin
--

INSERT INTO Siparis (siparis, musteri) VALUES (100007, 6);
INSERT INTO Siparis (siparis, musteri) VALUES (100006, 1);
INSERT INTO Siparis (siparis, musteri) VALUES (100003, 2);
INSERT INTO Siparis (siparis, musteri) VALUES (100004, 6);
INSERT INTO Siparis (siparis, musteri) VALUES (100001, 2);
INSERT INTO Siparis (siparis, musteri) VALUES (100002, 3);
INSERT INTO Siparis (siparis, musteri) VALUES (100005, 7);
INSERT INTO Siparis (siparis, musteri) VALUES (100000, 4);


--
-- TOC entry 2720 (class 2606 OID 65736)
-- Name: Fatura Fatura_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY Fatura
    ADD CONSTRAINT "Fatura_pkey" PRIMARY KEY (fat);


--
-- TOC entry 2714 (class 2606 OID 57553)
-- Name: Kitap_Siparisi Kitap_Siparisi_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY Kitap_Siparisi
    ADD CONSTRAINT "Kitap_Siparisi_pkey" PRIMARY KEY (sip, "ISBN");


--
-- TOC entry 2712 (class 2606 OID 65727)
-- Name: Kitaplar Kitaplar_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY Kitaplar
    ADD CONSTRAINT "Kitaplar_pkey" PRIMARY KEY ("ISBN");


--
-- TOC entry 2716 (class 2606 OID 65729)
-- Name: Kullanicilar Kullanicilar_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY Kullanicilar
    ADD CONSTRAINT "Kullanicilar_pkey" PRIMARY KEY (id);


--
-- TOC entry 2708 (class 2606 OID 65731)
-- Name: Musteri Musteri_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY Musteri
    ADD CONSTRAINT "Musteri_pkey" PRIMARY KEY (mid);


--
-- TOC entry 2718 (class 2606 OID 65725)
-- Name: Odemeler Odemeler_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY Odemeler
    ADD CONSTRAINT "Odemeler_pkey" PRIMARY KEY (tak, fat);


--
-- TOC entry 2710 (class 2606 OID 57555)
-- Name: Siparis Siparis_pkey; Type: CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY Siparis
    ADD CONSTRAINT Siparis_pkey PRIMARY KEY (siparis);


--
-- TOC entry 2724 (class 2606 OID 65757)
-- Name: Odemeler fat; Type: FK CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY Odemeler
    ADD CONSTRAINT fat FOREIGN KEY (fat) REFERENCES Fatura(fat) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2722 (class 2606 OID 65747)
-- Name: Kitap_Siparisi isbn; Type: FK CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY Kitap_Siparisi
    ADD CONSTRAINT isbn FOREIGN KEY ("ISBN") REFERENCES Kitaplar("ISBN") ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2721 (class 2606 OID 65742)
-- Name: Siparis musteri; Type: FK CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY Siparis
    ADD CONSTRAINT musteri FOREIGN KEY (musteri) REFERENCES Musteri(mid) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2725 (class 2606 OID 65737)
-- Name: Fatura sip; Type: FK CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY Fatura
    ADD CONSTRAINT sip FOREIGN KEY (sip) REFERENCES Siparis(siparis) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2723 (class 2606 OID 65752)
-- Name: Kitap_Siparisi siparis; Type: FK CONSTRAINT; Schema: public; Owner: admin
--

ALTER TABLE ONLY Kitap_Siparisi
    ADD CONSTRAINT siparis FOREIGN KEY (sip) REFERENCES Siparis(siparis) ON UPDATE CASCADE ON DELETE CASCADE;


-- Completed on 2019-12-21 12:31:59

--
-- PostgreSQL database dump complete
--

