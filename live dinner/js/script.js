const img = document.getElementsByClassName("slide-img");
const timeDelay = 3000;
let currentImageCounter = 0;

//img[currentImageCounter].style.display = "block";
img[currentImageCounter].style.opacity = 1;
setInterval(()=>{
    //img[currentImageCounter].style.display = "none";
    img[currentImageCounter].style.opacity = 0;

    currentImageCounter = (currentImageCounter+1) % img.length;
    //img[currentImageCounter].style.display = "block";
    img[currentImageCounter].style.opacity = 1;
}, timeDelay)

containerImg = document.querySelector(".section-3-right");
//imgDrink = ['img/img-01.jpg', 'img/img-02.jpg', 'img/img-03.jpg'];
imgDrink = [
    {
        imgSrc: 'img/img-01.jpg',
        imgName: 'Special Drinks 1',
        imgContent: 'Sed id magna vitae eros sagittis euismod.',
        imgPrice: '$7.79'
    },
    {
        imgSrc: 'img/img-02.jpg',
        imgName: 'Special Drinks 2',
        imgContent: 'Sed id magna vitae eros sagittis euismod.',
        imgPrice: '$9.79' 
    },
    {
        imgSrc: 'img/img-03.jpg',
        imgName: 'Special Drinks 3',
        imgContent: 'Sed id magna vitae eros sagittis euismod.',
        imgPrice: '$10.79'
    }
];
//imgLunch = ['img/img-04.jpg', 'img/img-05.jpg', 'img/img-06.jpg'];
imgLunch = [
    {
        imgSrc: 'img/img-04.jpg',
        imgName: 'Special Lunch 1',
        imgContent: 'Sed id magna vitae eros sagittis euismod.',
        imgPrice: '$15.79'
    },
    {
        imgSrc: 'img/img-05.jpg',
        imgName: 'Special Lunch 2',
        imgContent: 'Sed id magna vitae eros sagittis euismod.',
        imgPrice: '$18.79' 
    },
    {
        imgSrc: 'img/img-06.jpg',
        imgName: 'Special Lunch 3',
        imgContent: 'Sed id magna vitae eros sagittis euismod.',
        imgPrice: '$20.79'
    }
];
//imgDinner = ['img/img-07.jpg', 'img/img-08.jpg', 'img/img-09.jpg'];
imgDinner = [
    {
        imgSrc: 'img/img-07.jpg',
        imgName: 'Special Dinner 1',
        imgContent: 'Sed id magna vitae eros sagittis euismod.',
        imgPrice: '$25.79'
    },
    {
        imgSrc: 'img/img-08.jpg',
        imgName: 'Special Dinner 2',
        imgContent: 'Sed id magna vitae eros sagittis euismod.',
        imgPrice: '$22.79' 
    },
    {
        imgSrc: 'img/img-09.jpg',
        imgName: 'Special Dinner 3',
        imgContent: 'Sed id magna vitae eros sagittis euismod.',
        imgPrice: '$24.79'
    }
];
imgAll = imgDrink.concat(imgLunch,imgDinner);
showAll = () =>{
    show(imgAll);
    return false;
}
showDrinks = () =>{
    show(imgDrink);
    return false;
}
showDinner = () =>{
    show(imgDinner);
    return false;
}
showLunch = () =>{
    show(imgLunch);
    return false;
}
show = (listImg) =>{
    console.log(containerImg.childNodes.length)
    if(containerImg.childNodes.length > 0) {
        while(containerImg.childNodes.length > 0) {
            containerImg.removeChild(containerImg.childNodes[0])
            
        }
    }
    for (let i = 0; i < listImg.length; i++) {
            divParent = document.createElement('div');
            divParent.setAttribute('style', "width: 30.77%; margin: 0 0 20px 20px;display:inline-block;position:relative;overflow:hidden;");
            containerImg.appendChild(divParent);

            let imgChild = document.createElement('img');
            imgChild.setAttribute('class', "img-food");
            imgChild.setAttribute('src', listImg[i].imgSrc);
            imgChild.setAttribute('style', "max-width: 100%;max-height: 100%;display: block");
            imgChild.setAttribute('onmouseover', "mouseOver()");
            divParent.appendChild(imgChild);

            let divDetail = document.createElement('div');
            divDetail.setAttribute('class', "img-detail")
            divDetail.setAttribute('style', "background-color: #C39C6B; opacity: .9;color: #fff;position:absolute;top:0;left:0;opacity:0.9;width: 100%;height:100%;padding: 15px;box-sizing: border-box;transition: .5s all; top: 100%");
            divParent.appendChild(divDetail);

            let h4Child = document.createElement('h4');
            h4Child.textContent = listImg[i].imgName;
            divDetail.appendChild(h4Child);

            let pChild = document.createElement('p');
            pChild.textContent = listImg[i].imgContent;
            pChild.setAttribute('style',"font-size: 12px;text-align: left; margin: 10px 0 20px 0;");
            divDetail.appendChild(pChild);

            let h5Child = document.createElement('h5');
            h5Child.textContent = listImg[i].imgPrice;
            h5Child.setAttribute('style',"border-top:1px dashed #333;padding-top: 10px;font-size: 18px;");
            divDetail.appendChild(h5Child);
        }
}

//console.log(element);
window.onload = function(){
    showAll();
    hoverImg = document.getElementsByClassName("img-food");
   
    console.log(hoverImg);
    showGallery();
}
//load gallery
galleryWrap = document.querySelector('.section-4-gallery');
imgGallery = ['img/gallery-img-01.jpg', 
'img/gallery-img-02.jpg', 
'img/gallery-img-03.jpg', 
'img/gallery-img-04.jpg', 
'img/gallery-img-05.jpg',
'img/gallery-img-06.jpg'];

showGallery = () =>{
    for (let i = 0; i < imgGallery.length; i++) {
        let galleryParent = document.createElement('div');
        galleryParent.setAttribute('style', "border: 4px solid #D04F06");
        galleryWrap.appendChild(galleryParent);

        let galleryChild = document.createElement('img');
        galleryChild.setAttribute('src', imgGallery[i]);
        galleryChild.setAttribute('name', "gallery-img");
        galleryChild.setAttribute('onmouseover', "mouseOverGallery(this)");
        galleryChild.setAttribute('onmouseout', "mouseOutGallery(this)");
        galleryChild.setAttribute('style', "width: 100%;height: 100%;display:block;transition: .3s all;");
        galleryParent.appendChild(galleryChild);
    }
}
mouseOverGallery = (obj) =>{
    obj.style.transform = 'scale(1.07)';
    obj.style.boxShadow = '0 2px 3px rgba(0,0,0,0.2)';
}
mouseOutGallery = (obj) =>{
    obj.style.transform = 'scale(1)';
    obj.style.boxShadow = 'none';
}