const menuBtn=document.getElementById("menuBtn"),sidebar=document.getElementById("sidebar"),toast=document.getElementById("toast");
if(menuBtn)menuBtn.addEventListener("click",()=>sidebar.classList.toggle("open"));
function showToast(message){toast.textContent=message;toast.classList.add("show");setTimeout(()=>toast.classList.remove("show"),2600)}
const search=document.getElementById("search");
if(search)search.addEventListener("keydown",e=>{if(e.key==="Enter"&&search.value.trim())showToast(`Searching for "${search.value.trim()}"...`)});
